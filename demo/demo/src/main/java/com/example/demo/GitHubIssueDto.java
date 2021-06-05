package com.example.demo;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class GitHubIssueDto {
	
	private @NonNull String title;
	private @NonNull String comment;
	private @NonNull String label;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
}
