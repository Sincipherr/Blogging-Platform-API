package com.geekster.Blogging.Platform.API.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpOutput {
    private String status;
    private String message;
}
