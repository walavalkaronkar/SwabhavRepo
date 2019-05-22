package com.techlabs.state;

import com.techlabs.observer.AlertType;

public interface State {
	public void addAlertOption(AlertType alert);
	public void deleteAlertOption(AlertType alert);
	public void update(String message);
}
