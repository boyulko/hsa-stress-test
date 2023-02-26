package com.hsa.web.app.stresstest.service;

import com.hsa.web.app.stresstest.api.dto.MasterclassApplicationBatchRequest;
import com.hsa.web.app.stresstest.entity.MasterclassApplication;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MasterclassApplicationService {

  private final MongoTemplate mongoTemplate;

  public Set<MasterclassApplication> saveMasterclassApplication(MasterclassApplicationBatchRequest batchRequest) {
    var masterclassApplications = new HashSet<MasterclassApplication>();
    for (int i = 0; i < batchRequest.getOperationsCount(); i++) {
      var dto = batchRequest.getMasterclassApplicationDto();
      var id = UUID.randomUUID().toString();
      var masterclassApplication = new MasterclassApplication(id,
          dto.getFirstName(),
          dto.getLastName(),
          dto.getAge(),
          dto.getCurrentCompany(),
          dto.getYearsOfExperience());

      masterclassApplications.add(mongoTemplate.save(masterclassApplication));
    }
    return masterclassApplications;
  }

  public void get100MasterclassApplications() {
    mongoTemplate.findAll(MasterclassApplication.class);
  }
}
