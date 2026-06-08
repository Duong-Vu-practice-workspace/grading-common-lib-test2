package com.ptit.grading.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SubmissionStatus {
    PENDING("PENDING"),
    GRADING("GRADING"),
    DONE("DONE"),
    FAILED("FAILED");

    private final String value;
}
