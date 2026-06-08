package com.ptit.grading.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GradingJob {
    private UUID submissionId;
    private UUID assignmentId;
    private UUID studentId;
    private String minioPath;
    private Instant timestamp;
}
