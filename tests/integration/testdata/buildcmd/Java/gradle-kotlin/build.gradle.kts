plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("software.amazon.awssdk:annotations:2.1.0")
	compile("com.amazonaws:aws-lambda-java-core:1.1.0")
}
