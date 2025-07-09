package com.ghrer.transaction

import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@ExtendWith(DatabaseInitializer::class)
class BaseIntegrationTest