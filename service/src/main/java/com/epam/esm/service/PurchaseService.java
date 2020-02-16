package com.epam.esm.service;

import com.epam.esm.dto.PurchaseWithCertificateDto;
import com.epam.esm.model.Purchase;
import java.util.List;

public interface PurchaseService {

  PurchaseWithCertificateDto create(Purchase purchase, String resourceUrl);

  List<PurchaseWithCertificateDto> findPurchasesByUserId(Long userId, String resourceUrl);

}