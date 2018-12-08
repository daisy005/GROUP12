package test;
import spock.lang.Specification

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import spock.lang.*
import app.controller.*



class test extends Specification {
	def "Mood added"() {	
		expect:
			assertThat(stringToTest, isEmptyString())
}
}
