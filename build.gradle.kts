import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.0"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
	kotlin("plugin.jpa") version "1.6.21"
}

group = "com.oyee-taxi"
version = "1.0.0"
//version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {

	implementation("org.springframework.boot:spring-boot-starter-web") // Spring Web
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin") //Kotlin
	implementation("org.springframework.boot:spring-boot-starter-webflux") //Spring Reactive Web WebClients for external Http Request
	implementation("org.jetbrains.kotlin:kotlin-reflect") //Kotlin
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") //Kotlin
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor") //Kotlin Coroutines
	implementation("org.projectlombok:lombok:1.18.24") //Lombok for Java Annotations

	//Test
	implementation("junit:junit:4.13.2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	testImplementation("io.projectreactor:reactor-test")

	//USING
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb") //MongoDBDB
//	implementation("org.springframework.boot:spring-boot-starter-data-jpa") //POSTGRESQL
//	runtimeOnly("org.postgresql:postgresql")

	implementation("com.twilio.sdk:twilio:8.29.1") //Twillio
	implementation("org.springframework.boot:spring-boot-starter-mail") //Spring Java Mail Sender
	implementation("org.springframework.boot:spring-boot-starter-security") //Spring Security
	implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.13.3") //Jackson XML  https://github.com/FasterXML/jackson-dataformat-xml


//	//NOT USING
//	//runtimeOnly("mysql:mysql-connector-java") No Used //MySQL
//	implementation("io.socket:socket.io-server:4.0.1") //Socket.IO
//	implementation("io.springfox:springfox-boot-starter:3.0.0") //Swagger
//	implementation("io.springfox:springfox-swagger-ui:3.0.0") //Swagger UI


	//client sockjs
//  implementation("org.springframework.boot:spring-boot-starter-websocket") //Spring Web Socket
//	implementation ("org.webjars:webjars-locator-core")
//	implementation ("org.webjars:sockjs-client:1.5.1")
//	implementation ("org.webjars:stomp-websocket:2.3.4")
//	implementation ("org.webjars:bootstrap:5.1.3")
//	implementation ("org.webjars:jquery:3.6.0")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
