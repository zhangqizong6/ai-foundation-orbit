/**
 * @ClassName: MessageTest
 * @description:
 * @author: zhangqz
 * @date: 2026/09/06 19:10
 */

import com.foundation.ai.core.message.Message;
import com.foundation.ai.core.message.MessageRole;
import com.foundation.ai.core.message.TextContent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MessageTest {

    /**
     * 验证消息保留角色和文本内容。
     */
    @Test
    void shouldCreateMessage() {
        Message message = new Message(MessageRole.USER, new TextContent("Hello AI"));
        assertEquals(MessageRole.USER, message.getRole());
        assertEquals("Hello AI", ((TextContent) message.getContent()).getText());
    }

    /**
     * 验证文本内容有效但缺少角色时拒绝创建消息。
     */
    @Test
    void shouldRejectNullRole() {
        assertThrows(IllegalArgumentException.class, () -> new Message(null, new TextContent("Hello AI")));
    }

    @Test
    void shouldRejectNullContent() {
        assertThrows(IllegalArgumentException.class, () -> new Message(MessageRole.USER, null));
    }
}
