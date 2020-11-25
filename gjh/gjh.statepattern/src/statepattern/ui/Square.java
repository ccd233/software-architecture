package statepattern.ui;

import java.util.ArrayList;
import java.util.List;

import statepattern.states.ReadyState;
import statepattern.states.State;

public class Square {
	private State state;
	private boolean playing = false;
	private List<String> playlist =new ArrayList<>();
	private int currentPLC = 0;
	
	public Square() {
		this.state = new ReadyState(this);
		setPlaying(true);
		for(int i = 1;i <= 12; i++) {
			playlist.add("Fountain" + i);
		}
	}
	
	public void changeState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	public boolean isPlaying() {
		return playing;
	}
	
	public String startPlayback() {
		return "Playing" + playlist.get(currentPLC);
	}
	
	public String nextPLC() {
		currentPLC++;
		if(currentPLC > playlist.size() -1) {
			currentPLC = 0;
		}
		return "playing" + playlist.get(currentPLC);
	}
	
	public String previousPLC() {
		currentPLC--;
		if(currentPLC < 0) {
			currentPLC = playlist.size() -1;
		}
		return "playing" + playlist.get(currentPLC);
	}
	
	public void setCurrentPLCAfterStop() {
		this.currentPLC =0;
	}

}
