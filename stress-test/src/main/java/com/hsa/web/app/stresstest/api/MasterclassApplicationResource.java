package com.hsa.web.app.stresstest.api;

import com.hsa.web.app.stresstest.api.dto.MasterclassApplicationBatchRequest;
import com.hsa.web.app.stresstest.entity.MasterclassApplication;
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
  public ResponseEntity<Set<MasterclassApplication>> createMasterclassApplication(
      @RequestBody MasterclassApplicationBatchRequest masterclassApplicationBatchRequest) {
    Set<MasterclassApplication> applications = service.saveMasterclassApplication(
        masterclassApplicationBatchRequest);
    return ResponseEntity.status(HttpStatus.CREATED).body(applications);
  }

  @GetMapping("/applications")
  public ResponseEntity<Void> get100MasterclassApplications() {
    service.get100MasterclassApplications();
    return ResponseEntity.ok().build();
  }

}
