package br.com.eduarda.brum.email.organizer.domain.user.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileResponse {

    private String emailAddress;
    private Integer messagesTotal;
    private Integer threadsTotal;
    private Integer historyId;
}
