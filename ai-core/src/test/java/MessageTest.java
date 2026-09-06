/**
 * @ClassName: MessageTest
 * @description:
 * @author: zhangqz
 * @date: 2026/09/06 19:10
 */

import com.foundation.ai.core.message.Message;
import com.foundation.ai.core.message.MessageRole;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MessageTest {

    @Test
    void shouldCreateMessage() {
        Message message = new Message(MessageRole.USER, "Hello AI");
        assertEquals(MessageRole.USER, message.getRole());
        assertEquals("Hello AI", message.getContent());
    }

    @Test
    void shouldRejectNullRole() {
        assertThrows(IllegalArgumentException.class, () -> new Message(null, "Hello AI"));
    }

    @Test
    void shouldRejectNullContent() {
        assertThrows(IllegalArgumentException.class, () -> new Message(MessageRole.USER, null));
    }
}