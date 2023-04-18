package com.moneylion.sse.model;

import lombok.Data;

import java.util.Date;

@Data
public class LiveScore {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private Date updateDate;
}