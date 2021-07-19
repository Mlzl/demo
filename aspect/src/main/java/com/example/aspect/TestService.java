package com.example.aspect;

import com.example.aspect.annotation.CatchException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author ambi
 * @data 2021/7/2 11:05
 */
@Service
@Slf4j
public class TestService {

    @CatchException
    public void testVoid() throws Exception {
        log.info("testVoid start");
        throw new Exception("testVoid");
    }

    @CatchException(returnDataType = ReturnDataType.null_type)
    public Object testReturnNull() throws Exception {
        log.info("testReturnNull start");
        throw new Exception("testReturnNull");
    }

    @CatchException(returnDataType = ReturnDataType.byte_type, byteValue = 3)
    public byte testReturnByte() throws Exception {
        log.info("testReturnByte start");
        throw new Exception("testReturnByte");
    }

    @CatchException(returnDataType = ReturnDataType.short_type, byteValue = 4)
    public short testReturnShort() throws Exception {
        log.info("testReturnShort start");
        throw new Exception("testReturnShort");
    }

    @CatchException(returnDataType = ReturnDataType.object_type, objectClass = Human.class)
    public Human testReturnObject() throws Exception {
        log.info("testReturnObject start");
        throw new Exception("testReturnObject");
    }

    @CatchException(returnDataType = ReturnDataType.int_type, intValue = 10)
    public int testReturnInt() throws Exception {
        log.info("testReturnInt start");
        throw new Exception("testReturnInt");
    }
}
