package com.example.schedule.dto;

import lombok.Getter;

@Getter
public class ScheduleUpdateResponse {
    private final Long id;
    private final String title;
    private final String content;

    public ScheduleUpdateResponse(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
