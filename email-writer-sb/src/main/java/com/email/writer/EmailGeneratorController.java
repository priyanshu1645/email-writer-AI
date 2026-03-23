package com.email.writer;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailGeneratorController {
    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/Generate")
    public ResponseEntity<String> GenerateEmail(@RequestBody EmailRequest emailRequest) throws JsonProcessingException {
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}

