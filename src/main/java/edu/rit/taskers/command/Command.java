package edu.rit.taskers.command;

import java.util.List;

import edu.rit.taskers.model.User;

public interface Command<T> {
	List<T> execute() throws CommandFailure;
}
