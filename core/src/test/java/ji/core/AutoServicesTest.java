
/*
 *  Copyright 2019 Zhong Lunfu
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package ji.core;

import fj.data.List;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AutoServicesTest {
    @Test
    public void should_get_classes() {
        final List<String> classes = AutoServices.classesAnnotated(ClassLoaderInjection.Target.class);
        assertThat(classes, is(List.arrayList(Dispatcher.Handler.class, Dispatcher.DefaultHandler.class, Dispatcher.class).map(Class::getName)));
    }

}