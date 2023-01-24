package com.codex;

import java.util.*;

public class Solution {
package com.megafon.demo.service.impl;

import com.megafon.demo.exception.WrongNumberException;
import com.megafon.demo.service.SumService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * New Class
 *
 * @author ZiminAS
 * @since 18.05.2018
 */
@Service
@Slf4j
public class SumThreeServiceImpl implements SumService {
    private Logger logger = LoggerFactory.getLogger(SumThreeServiceImpl.class);

    @Override
    public static long[] sumOfThree(long num) {
        logger.debug("Input number: {}", num);
        if (num % 3 != 0) {
            logger.error("This number is not divisible by 3");
            throw new WrongNumberException("This number is not divisible by 3: " + num);
        }
        long[] result = new long[0];
        long sum = num / 3;
        result = new long[3];
        result[0] = sum;
        result[1] = sum + 1;
        result[2] = sum + 2;
        logger.debug("Result: {}", result);
        return result;
    }
}
}