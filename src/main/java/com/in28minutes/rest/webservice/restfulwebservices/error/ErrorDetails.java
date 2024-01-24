package com.in28minutes.rest.webservice.restfulwebservices.error;

import java.time.LocalDate;

public record ErrorDetails(LocalDate timestamp, String message, String details) {
}
