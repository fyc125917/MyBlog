package com.ryan.daily.numberFormat;

import java.math.BigDecimal;

public enum RoundMode {

    /**
     *<tr align=right><td>5.5</td>  <td>6</td>
     *<tr align=right><td>2.5</td>  <td>3</td>
     *<tr align=right><td>1.6</td>  <td>2</td>
     *<tr align=right><td>1.1</td>  <td>2</td>
     *<tr align=right><td>1.0</td>  <td>1</td>
     *<tr align=right><td>-1.0</td> <td>-1</td>
     *<tr align=right><td>-1.1</td> <td>-2</td>
     *<tr align=right><td>-1.6</td> <td>-2</td>
     *<tr align=right><td>-2.5</td> <td>-3</td>
     *<tr align=right><td>-5.5</td> <td>-6</td>
     *</table>
     */
    UP,

    /**
     *<tr align=right><td>5.5</td>  <td>5</td>
     *<tr align=right><td>2.5</td>  <td>2</td>
     *<tr align=right><td>1.6</td>  <td>1</td>
     *<tr align=right><td>1.1</td>  <td>1</td>
     *<tr align=right><td>1.0</td>  <td>1</td>
     *<tr align=right><td>-1.0</td> <td>-1</td>
     *<tr align=right><td>-1.1</td> <td>-1</td>
     *<tr align=right><td>-1.6</td> <td>-1</td>
     *<tr align=right><td>-2.5</td> <td>-2</td>
     *<tr align=right><td>-5.5</td> <td>-5</td>
     *</table>
     */
    DOWN,

    /**
     *<tr align=right><td>5.5</td>  <td>6</td>
     *<tr align=right><td>2.5</td>  <td>3</td>
     *<tr align=right><td>1.6</td>  <td>2</td>
     *<tr align=right><td>1.1</td>  <td>2</td>
     *<tr align=right><td>1.0</td>  <td>1</td>
     *<tr align=right><td>-1.0</td> <td>-1</td>
     *<tr align=right><td>-1.1</td> <td>-1</td>
     *<tr align=right><td>-1.6</td> <td>-1</td>
     *<tr align=right><td>-2.5</td> <td>-2</td>
     *<tr align=right><td>-5.5</td> <td>-5</td>
     *</table>
     */
    CEILING,

    /**
     *<tr align=right><td>5.5</td>  <td>5</td>
     *<tr align=right><td>2.5</td>  <td>2</td>
     *<tr align=right><td>1.6</td>  <td>1</td>
     *<tr align=right><td>1.1</td>  <td>1</td>
     *<tr align=right><td>1.0</td>  <td>1</td>
     *<tr align=right><td>-1.0</td> <td>-1</td>
     *<tr align=right><td>-1.1</td> <td>-2</td>
     *<tr align=right><td>-1.6</td> <td>-2</td>
     *<tr align=right><td>-2.5</td> <td>-3</td>
     *<tr align=right><td>-5.5</td> <td>-6</td>
     *</table>
     */
    FLOOR,

    /**
     *<tr align=right><td>5.5</td>  <td>6</td>
     *<tr align=right><td>2.5</td>  <td>3</td>
     *<tr align=right><td>1.6</td>  <td>2</td>
     *<tr align=right><td>1.1</td>  <td>1</td>
     *<tr align=right><td>1.0</td>  <td>1</td>
     *<tr align=right><td>-1.0</td> <td>-1</td>
     *<tr align=right><td>-1.1</td> <td>-1</td>
     *<tr align=right><td>-1.6</td> <td>-2</td>
     *<tr align=right><td>-2.5</td> <td>-3</td>
     *<tr align=right><td>-5.5</td> <td>-6</td>
     *</table>
     */
    HALF_UP,

    /**
     *<tr align=right><td>5.5</td>  <td>5</td>
     *<tr align=right><td>2.5</td>  <td>2</td>
     *<tr align=right><td>1.6</td>  <td>2</td>
     *<tr align=right><td>1.1</td>  <td>1</td>
     *<tr align=right><td>1.0</td>  <td>1</td>
     *<tr align=right><td>-1.0</td> <td>-1</td>
     *<tr align=right><td>-1.1</td> <td>-1</td>
     *<tr align=right><td>-1.6</td> <td>-2</td>
     *<tr align=right><td>-2.5</td> <td>-2</td>
     *<tr align=right><td>-5.5</td> <td>-5</td>
     *</table>
     */
    HALF_DOWN(),

    /**
     *<tr align=right><td>5.5</td>  <td>6</td>
     *<tr align=right><td>2.5</td>  <td>2</td>
     *<tr align=right><td>1.6</td>  <td>2</td>
     *<tr align=right><td>1.1</td>  <td>1</td>
     *<tr align=right><td>1.0</td>  <td>1</td>
     *<tr align=right><td>-1.0</td> <td>-1</td>
     *<tr align=right><td>-1.1</td> <td>-1</td>
     *<tr align=right><td>-1.6</td> <td>-2</td>
     *<tr align=right><td>-2.5</td> <td>-2</td>
     *<tr align=right><td>-5.5</td> <td>-6</td>
     *</table>
     */
    HALF_EVEN(),

    /**
     *<tr align=right><td>5.5</td>  <td>throw {@code ArithmeticException}</td>
     *<tr align=right><td>2.5</td>  <td>throw {@code ArithmeticException}</td>
     *<tr align=right><td>1.6</td>  <td>throw {@code ArithmeticException}</td>
     *<tr align=right><td>1.1</td>  <td>throw {@code ArithmeticException}</td>
     *<tr align=right><td>1.0</td>  <td>1</td>
     *<tr align=right><td>-1.0</td> <td>-1</td>
     *<tr align=right><td>-1.1</td> <td>throw {@code ArithmeticException}</td>
     *<tr align=right><td>-1.6</td> <td>throw {@code ArithmeticException}</td>
     *<tr align=right><td>-2.5</td> <td>throw {@code ArithmeticException}</td>
     *<tr align=right><td>-5.5</td> <td>throw {@code ArithmeticException}</td>
     *</table>
     */
    UNNECESSARY();


}
