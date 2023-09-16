//package com.kidchai.tacocloud.web.api;
//
//import com.kidchai.tacocloud.data.OrderRepository;
//import com.kidchai.tacocloud.models.TacoOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(path = "/api/tacos",
//        produces = "application/json")
//@CrossOrigin(origins = {"http://localhost:8080", "http://tacocloud.com"})
//public class OrderController {
//
//    private final OrderRepository orderRepo;
//
//    @Autowired
//    public OrderController(OrderRepository orderRepo) {
//        this.orderRepo = orderRepo;
//    }
//
//    @GetMapping(path = "/{orderId}", produces = "application/json")
//    public TacoOrder getOrder(@PathVariable("orderId") Long orderId) {
//        return orderRepo.findById(orderId).get();
//    }
//
//    @GetMapping(produces = "application/json")
//    public Iterable<TacoOrder> getAllOrders() {
//        return orderRepo.findAll();
//    }
//
//    @PostMapping(consumes = "application/json")
//    @ResponseStatus(HttpStatus.CREATED)
//    public TacoOrder postOrder(@RequestBody TacoOrder order) {
//        return orderRepo.save(order);
//    }
//
//    @PutMapping(path = "/{orderId}", consumes = "application/json")
//    public TacoOrder putOrder(@PathVariable("orderId") Long orderId,
//                              @RequestBody TacoOrder order) {
//        order.setId(orderId);
//        return orderRepo.save(order);
//    }
//
//    @PatchMapping(path = "/{orderId}", consumes = "application/json")
//    public TacoOrder patchOrder(@PathVariable("orderId") Long orderId,
//                                @RequestBody TacoOrder patch) {
//        TacoOrder order = orderRepo.findById(orderId).get();
//        if (patch.getDeliveryName() != null)
//            order.setDeliveryName(patch.getDeliveryName());
//        if (patch.getDeliveryStreet() != null)
//            order.setDeliveryStreet(patch.getDeliveryStreet());
//        if (patch.getDeliveryCity() != null)
//            order.setDeliveryCity(patch.getDeliveryCity());
//        if (patch.getDeliveryState() != null)
//            order.setDeliveryState(patch.getDeliveryState());
//        if (patch.getDeliveryZip() != null)
//            order.setDeliveryZip(patch.getDeliveryZip());
//        if (patch.getCcNumber() != null)
//            order.setCcNumber(patch.getCcNumber());
//        if (patch.getCcExpiration() != null)
//            order.setCcExpiration(patch.getCcExpiration());
//        if (patch.getCcCVV() != null)
//            order.setCcCVV(patch.getCcCVV());
//        return orderRepo.save(order);
//    }
//
//    @DeleteMapping("/{orderId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteOrder(@PathVariable("orderId") Long orderId) {
//        try {
//            orderRepo.deleteById(orderId);
//        } catch (EmptyResultDataAccessException ignored) {}
//    }
//}
