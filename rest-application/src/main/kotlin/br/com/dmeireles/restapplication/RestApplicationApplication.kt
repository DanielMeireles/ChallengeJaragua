package br.com.dmeireles.restapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.web.config.EnableSpringDataWebSupport

@SpringBootApplication
@EnableSpringDataWebSupport
class SpringKafkaDomainApplication

fun main(args: Array<String>) {
	runApplication<SpringKafkaDomainApplication>(*args)
}
