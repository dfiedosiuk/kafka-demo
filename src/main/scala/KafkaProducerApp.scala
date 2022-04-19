import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}
import java.util.Properties

object KafkaProducerApp extends App {

  val props = new Properties()
  props.put("bootstrap.servers", "localhost:9092")
  props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
  props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")

  val producer = new KafkaProducer[String, String](props)

  producer.send(new ProducerRecord[String, String]("my-topic", "HAKUNA MATATA 100"))

  producer.close();

}
