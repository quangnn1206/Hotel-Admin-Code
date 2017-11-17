/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import services.ApplicationService;

/**
 *
 * @author HUNGCUONG
 */

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Override
    public String uploadfile(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model, String itemType) {
        return uploadfile(commonsMultipartFiles, request, model, itemType);
    }

    @Override
    public String sendEmail(String message, String sendto, String subject) {
        return sendEmail(message, sendto, subject);
    }

    @Override
    public String removeAccent(String originalString) {
        return removeAccent(originalString);
    }
    
}
