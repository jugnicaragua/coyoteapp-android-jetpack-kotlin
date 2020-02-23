package ni.org.jug.coyoteapp.domain.entity

import java.time.LocalDateTime

data class Bank(var id: Long, var description: String, var shortDescription: String,
                var active: Boolean, var createdOn: LocalDateTime, var updatedOn: LocalDateTime,
                var url: String, var cookies: List<String>)
