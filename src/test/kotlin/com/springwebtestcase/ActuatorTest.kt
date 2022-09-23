package com.springwebtestcase

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class ActuatorTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `The health endpoint can be accessed`() {
        mockMvc
            .get("/actuator/health")
            .andExpect { status { isOk() } }
    }

}
