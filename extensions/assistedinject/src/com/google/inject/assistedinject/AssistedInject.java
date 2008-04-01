/**
 * Copyright (C) 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.inject.assistedinject;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 * Constructors annotated with <code>@AssistedInject</code> indicate that will
 * can be instantiated by the {@link FactoryProvider}.  Each constructor must
 * exactly one corresponding factory method within the Factory Interface.
 * 
 * <p>Constructor parameters must be either supplied by the Factory Interface and
 * marked with <code>@Assisted</code>, or they must be injectable.
 * 
 * @author jmourits@google.com (Jerome Mourits)
 * @author jessewilson@google.com (Jesse Wilson)
 */
@Target({CONSTRUCTOR})
@Retention(RUNTIME)
public @interface AssistedInject {}