package ua.ksa.pipline.simpleservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Sergii_Kryvko on 2/19/2019
 * @project simpleservice
 */
@Controller
@RequestMapping(path = "/")
@Slf4j
public class BasicController {

    @RequestMapping(path = "echo", method = RequestMethod.GET)
    public ResponseEntity echo() {
        log.info("echo request");
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}
