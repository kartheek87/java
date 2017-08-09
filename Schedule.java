package com.kumanoit.graphs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Schedule {
	public static List<Show> findOptimalSchedule(Collection<Show> shows) {
		List<Show> solution = new ArrayList<>();
		Show lastShow = new Show("dummy", new Date(0), new Date(0));
		for (Show currentShow : shows) {
			if (lastShow.getName().equals("dummy")) {
				lastShow = currentShow;
				continue;
			}
			if (currentShow.getStartTime().after(lastShow.getEndTime())) {
				// last show is over
				// put last show to watch list
				solution.add(lastShow);
				lastShow = currentShow;
			} else if (currentShow.getStartTime().equals(lastShow.getStartTime())
					&& currentShow.getEndTime().before(lastShow.getEndTime())) {
				lastShow = currentShow;
			} else if (currentShow.getEndTime().before(lastShow.getEndTime())) {
				// this show gets over before the last show
				// leave this show and start watching current show
				lastShow = currentShow;
			}
		}
		solution.add(lastShow);
		return solution;
	}

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

		ArrayList<Show> shows = new ArrayList<Show>();
		shows.add(new Show("Show1", sdf.parse("2013-08-06 18:00"), sdf.parse("2013-08-06 20:00")));
		shows.add(new Show("Show2", sdf.parse("2013-08-06 19:00"), sdf.parse("2013-08-06 22:00")));
		shows.add(new Show("Show3", sdf.parse("2013-08-06 21:00"), sdf.parse("2013-08-06 23:00")));

		Collections.sort(shows);
		// shows.forEach(item -> System.out.println(item.getName()));
		List<Show> list = Schedule.findOptimalSchedule(shows);
		for (Show show : list) {
			System.out.println(show.getName());
		}
	}
}

class Show implements Comparable<Show> {
	private String name;
	private Date startTime;
	private Date endTime;

	public Show(String name, Date startTime, Date endTime) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getName() {
		return name;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	@Override
	public int compareTo(Show o) {
		if (this.startTime.before(o.startTime)) {
			return -1;
		} else if (this.startTime.equals(o.startTime)) {
			if (this.endTime.before(o.endTime)) {
				return -1;
			} else if (this.endTime.equals(o.endTime)) {
				return 0;
			}
			return 1;
		}
		return 1;
	}
}