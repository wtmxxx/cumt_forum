package com.atcumt.model.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QqAccessTokenDTO {
    private String access_token;
    private String expires_in;
    private String refresh_token;
    private String openid;
}