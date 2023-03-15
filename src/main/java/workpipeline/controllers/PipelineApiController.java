package workpipeline.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/continuous-integration")
public class PipelineApiController {

    @GetMapping("/msg-sucess")
    public ResponseEntity getSucessMsg(){
        return ResponseEntity.ok("SUCESSO");
    }
}
