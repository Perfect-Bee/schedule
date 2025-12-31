package com.example.schedule.dto;

import lombok.Getter;

@Getter
public class ScheduleGetResponse {
    private final Long id;
    private final String title;
    private final String content;

    public ScheduleGetResponse(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
