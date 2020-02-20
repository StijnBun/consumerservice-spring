package ordina.accelerator.consumerservice.service;

import ordina.accelerator.consumerservice.model.AcceleratorObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private ProducerClient producerClient;

   public AcceleratorObject retrieveAcceleratorObjectValue(){
       return producerClient.getAcceleratorObject();
   }

}
