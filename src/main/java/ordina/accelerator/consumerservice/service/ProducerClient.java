package ordina.accelerator.consumerservice.service;

import ordina.accelerator.consumerservice.model.AcceleratorObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "producerservice",  url = "localhost:8080/producerservice")
public interface ProducerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/acceleratorobject", consumes = {"application/JSON"})
    AcceleratorObject getAcceleratorObject();

}
