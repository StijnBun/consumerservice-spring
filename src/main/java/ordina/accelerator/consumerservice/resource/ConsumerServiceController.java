package ordina.accelerator.consumerservice.resource;

import ordina.accelerator.consumerservice.model.AcceleratorObject;
import ordina.accelerator.consumerservice.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumerservice")
public class ConsumerServiceController
{
    @Autowired
    private ProducerService producerService;

    @GetMapping("/acceleratorobject")
    public AcceleratorObject returnAcceleratorObjectValue(){
        return producerService.retrieveAcceleratorObjectValue();
    }


}
