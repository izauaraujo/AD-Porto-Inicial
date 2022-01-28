package com.secretaria.ADPorto.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.secretaria.ADPorto.entity.Member;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
@Service
public class CongregationService {

      private static final String COLECTTION_NAME = "CONGREGAÇÕES";


        public String saveCongregationMember(Member member) throws ExecutionException, InterruptedException {

            Firestore dbFirestore = FirestoreClient.getFirestore();

            ApiFuture<WriteResult> collectionApiFuture=dbFirestore.collection(COLECTTION_NAME). document(member.getCongregation()).set(member);

            return collectionApiFuture.get().getUpdateTime().toString();


        }

}
