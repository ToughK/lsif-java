package minimized;

import java.util.function.Function;
//     ^^^^ reference java/
//          ^^^^ reference java/util/
//               ^^^^^^^^ reference java/util/function/
//                        ^^^^^^^^ reference java/util/function/Function#

@SuppressWarnings("ALL")
 ^^^^^^^^^^^^^^^^ reference java/lang/SuppressWarnings#
public class AnonymousClasses {
//     ^^^^^^ definition minimized/AnonymousClasses#`<init>`().
//     ^^^^^^^^^^^^^^^^ definition minimized/AnonymousClasses#
  public static int app(int n) {
//                  ^^^ definition minimized/AnonymousClasses#app().
//                          ^ definition local0
    Function<Integer, Integer> fn =
//  ^^^^^^^^ reference java/util/function/Function#
//           ^^^^^^^ reference java/lang/Integer#
//                    ^^^^^^^ reference java/lang/Integer#
//                             ^^ definition local1
        new Function<Integer, Integer>() {
//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ reference minimized/AnonymousClasses#app().``#`<init>`(). 5:9
//          ^^^^^^^^ reference java/util/function/Function#
//          ^^^^^^^^ reference java/util/function/Function#
//                   ^^^^^^^ reference java/lang/Integer#
//                   ^^^^^^^ reference java/lang/Integer#
//                            ^^^^^^^ reference java/lang/Integer#
//                            ^^^^^^^ reference java/lang/Integer#
//                                       ^ definition minimized/AnonymousClasses#app().``#`<init>`(). 1:4
          @Override
//         ^^^^^^^^ reference java/lang/Override#
          public Integer apply(Integer integer) {
//               ^^^^^^^ reference java/lang/Integer#
//                       ^^^^^ definition minimized/AnonymousClasses#app().``#apply().
//                             ^^^^^^^ reference java/lang/Integer#
//                                     ^^^^^^^ definition local2
            return integer + n;
//                 ^^^^^^^ reference local2
//                           ^ reference local0
          }
        };

    return fn.apply(n);
//         ^^ reference local1
//            ^^^^^ reference java/util/function/Function#apply().
//                  ^ reference local0
  }
}
