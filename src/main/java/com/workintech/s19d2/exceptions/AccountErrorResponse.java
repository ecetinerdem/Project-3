package com.workintech.s19d2.exceptions;

import java.time.LocalDateTime;

public record AccountErrorResponse(Integer status, String message, LocalDateTime localDateTime) {
}
