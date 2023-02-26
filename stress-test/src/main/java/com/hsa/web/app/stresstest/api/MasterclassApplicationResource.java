package com.hsa.web.app.stresstest.api;

import com.hsa.web.app.stresstest.api.dto.MasterclassApplicationDto;
import com.hsa.web.app.stresstest.service.MasterclassApplicationService;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MasterclassApplicationResource {

  private final MasterclassApplicationService service;

  @PostMapping("/applications")
  public ResponseEntity<Void> createMasterclassApplication(@RequestBody MasterclassApplicationDto dto) {
    service.saveMasterclassApplication(dto);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

}
