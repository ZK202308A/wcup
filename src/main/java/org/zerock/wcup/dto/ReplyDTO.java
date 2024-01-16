package org.zerock.wcup.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReplyDTO {

    private Long rno;
    private String replyText;
    private String replyer;
    private Long bno;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
