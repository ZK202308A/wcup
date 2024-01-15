package org.zerock.wcup.repository;


import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.zerock.wcup.domain.OrderDetail;
import org.zerock.wcup.domain.OrderEntity;

@SpringBootTest
@Log4j2
public class OrderTests {

    @Autowired
    private OrderEntityRepository orderEntityRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Transactional
    @Commit
    @Test
    public void testInsert(){

        OrderEntity orderEntity = OrderEntity.builder().buyer("u1").build();

        orderEntityRepository.save(orderEntity);

        OrderDetail orderDetail1 = OrderDetail.builder()
                .pno(100L)
                .qty(3)
                .orderEntity(orderEntity)
                .build();

        orderDetailRepository.save(orderDetail1);

    }


}
