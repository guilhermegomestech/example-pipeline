package workpipeline.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import workpipeline.WorkPipelineApplication;

import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/continuous-integration")
public class PipelineApiController {

    public static final Logger LOGGER = Logger.getLogger(PipelineApiController.class.getName());
    @GetMapping("/msg-sucess")
    public ResponseEntity getSucessMsg(){
        LOGGER.info("Chamando mensagem de sucesso...");
        return ResponseEntity.ok("Pipeline executada com sucesso!");
    }
}
