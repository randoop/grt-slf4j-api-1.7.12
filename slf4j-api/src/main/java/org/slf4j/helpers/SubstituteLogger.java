/**
 * Copyright (c) 2004-2011 QOS.ch
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
package org1.slf4j.helpers;

import org.checkerframework.dataflow.qual.Impure;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org1.slf4j.Logger;
import org1.slf4j.Marker;

/**
 * A logger implementation which logs via a delegate logger. By default, the delegate is a
 * {@link NOPLogger}. However, a different delegate can be set at anytime.
 * <p/>
 * See also the <a href="http://www.slf4j.org/codes.html#substituteLogger">relevant
 * error code</a> documentation.
 *
 * @author Chetan Mehrotra
 */
public class SubstituteLogger implements Logger {

    private final String name;

    private volatile Logger _delegate;

    @SideEffectFree
    public SubstituteLogger(String name) {
        this.name = name;
    }

    @Pure
    public String getName() {
        return name;
    }

    @Impure
    public boolean isTraceEnabled() {
        return delegate().isTraceEnabled();
    }

    @Impure
    public void trace(String msg) {
        delegate().trace(msg);
    }

    @Impure
    public void trace(String format, Object arg) {
        delegate().trace(format, arg);
    }

    @Impure
    public void trace(String format, Object arg1, Object arg2) {
        delegate().trace(format, arg1, arg2);
    }

    @Impure
    public void trace(String format, Object... arguments) {
        delegate().trace(format, arguments);
    }

    @Impure
    public void trace(String msg, Throwable t) {
        delegate().trace(msg, t);
    }

    @Impure
    public boolean isTraceEnabled(Marker marker) {
        return delegate().isTraceEnabled(marker);
    }

    @Impure
    public void trace(Marker marker, String msg) {
        delegate().trace(marker, msg);
    }

    @Impure
    public void trace(Marker marker, String format, Object arg) {
        delegate().trace(marker, format, arg);
    }

    @Impure
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        delegate().trace(marker, format, arg1, arg2);
    }

    @Impure
    public void trace(Marker marker, String format, Object... arguments) {
        delegate().trace(marker, format, arguments);
    }

    @Impure
    public void trace(Marker marker, String msg, Throwable t) {
        delegate().trace(marker, msg, t);
    }

    @Impure
    public boolean isDebugEnabled() {
        return delegate().isDebugEnabled();
    }

    @Impure
    public void debug(String msg) {
        delegate().debug(msg);
    }

    @Impure
    public void debug(String format, Object arg) {
        delegate().debug(format, arg);
    }

    @Impure
    public void debug(String format, Object arg1, Object arg2) {
        delegate().debug(format, arg1, arg2);
    }

    @Impure
    public void debug(String format, Object... arguments) {
        delegate().debug(format, arguments);
    }

    @Impure
    public void debug(String msg, Throwable t) {
        delegate().debug(msg, t);
    }

    @Impure
    public boolean isDebugEnabled(Marker marker) {
        return delegate().isDebugEnabled(marker);
    }

    @Impure
    public void debug(Marker marker, String msg) {
        delegate().debug(marker, msg);
    }

    @Impure
    public void debug(Marker marker, String format, Object arg) {
        delegate().debug(marker, format, arg);
    }

    @Impure
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        delegate().debug(marker, format, arg1, arg2);
    }

    @Impure
    public void debug(Marker marker, String format, Object... arguments) {
        delegate().debug(marker, format, arguments);
    }

    @Impure
    public void debug(Marker marker, String msg, Throwable t) {
        delegate().debug(marker, msg, t);
    }

    @Impure
    public boolean isInfoEnabled() {
        return delegate().isInfoEnabled();
    }

    @Impure
    public void info(String msg) {
        delegate().info(msg);
    }

    @Impure
    public void info(String format, Object arg) {
        delegate().info(format, arg);
    }

    @Impure
    public void info(String format, Object arg1, Object arg2) {
        delegate().info(format, arg1, arg2);
    }

    @Impure
    public void info(String format, Object... arguments) {
        delegate().info(format, arguments);
    }

    @Impure
    public void info(String msg, Throwable t) {
        delegate().info(msg, t);
    }

    @Impure
    public boolean isInfoEnabled(Marker marker) {
        return delegate().isInfoEnabled(marker);
    }

    @Impure
    public void info(Marker marker, String msg) {
        delegate().info(marker, msg);
    }

    @Impure
    public void info(Marker marker, String format, Object arg) {
        delegate().info(marker, format, arg);
    }

    @Impure
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        delegate().info(marker, format, arg1, arg2);
    }

    @Impure
    public void info(Marker marker, String format, Object... arguments) {
        delegate().info(marker, format, arguments);
    }

    @Impure
    public void info(Marker marker, String msg, Throwable t) {
        delegate().info(marker, msg, t);
    }

    @Impure
    public boolean isWarnEnabled() {
        return delegate().isWarnEnabled();
    }

    @Impure
    public void warn(String msg) {
        delegate().warn(msg);
    }

    @Impure
    public void warn(String format, Object arg) {
        delegate().warn(format, arg);
    }

    @Impure
    public void warn(String format, Object arg1, Object arg2) {
        delegate().warn(format, arg1, arg2);
    }

    @Impure
    public void warn(String format, Object... arguments) {
        delegate().warn(format, arguments);
    }

    @Impure
    public void warn(String msg, Throwable t) {
        delegate().warn(msg, t);
    }

    @Impure
    public boolean isWarnEnabled(Marker marker) {
        return delegate().isWarnEnabled(marker);
    }

    @Impure
    public void warn(Marker marker, String msg) {
        delegate().warn(marker, msg);
    }

    @Impure
    public void warn(Marker marker, String format, Object arg) {
        delegate().warn(marker, format, arg);
    }

    @Impure
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        delegate().warn(marker, format, arg1, arg2);
    }

    @Impure
    public void warn(Marker marker, String format, Object... arguments) {
        delegate().warn(marker, format, arguments);
    }

    @Impure
    public void warn(Marker marker, String msg, Throwable t) {
        delegate().warn(marker, msg, t);
    }

    @Impure
    public boolean isErrorEnabled() {
        return delegate().isErrorEnabled();
    }

    @Impure
    public void error(String msg) {
        delegate().error(msg);
    }

    @Impure
    public void error(String format, Object arg) {
        delegate().error(format, arg);
    }

    @Impure
    public void error(String format, Object arg1, Object arg2) {
        delegate().error(format, arg1, arg2);
    }

    @Impure
    public void error(String format, Object... arguments) {
        delegate().error(format, arguments);
    }

    @Impure
    public void error(String msg, Throwable t) {
        delegate().error(msg, t);
    }

    @Impure
    public boolean isErrorEnabled(Marker marker) {
        return delegate().isErrorEnabled(marker);
    }

    @Impure
    public void error(Marker marker, String msg) {
        delegate().error(marker, msg);
    }

    @Impure
    public void error(Marker marker, String format, Object arg) {
        delegate().error(marker, format, arg);
    }

    @Impure
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        delegate().error(marker, format, arg1, arg2);
    }

    @Impure
    public void error(Marker marker, String format, Object... arguments) {
        delegate().error(marker, format, arguments);
    }

    @Impure
    public void error(Marker marker, String msg, Throwable t) {
        delegate().error(marker, msg, t);
    }

    @Pure
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        SubstituteLogger that = (SubstituteLogger) o;

        if (!name.equals(that.name))
            return false;

        return true;
    }

    @Pure
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    /**
     * Return the delegate logger instance if set. Otherwise, return a {@link NOPLogger}
     * instance.
     */
    @Pure
    Logger delegate() {
        return _delegate != null ? _delegate : NOPLogger.NOP_LOGGER;
    }

    /**
     * Typically called after the {@link org1.slf4j.LoggerFactory} initialization phase is completed.
     * @param delegate
     */
    @Impure
    public void setDelegate(Logger delegate) {
        this._delegate = delegate;
    }
}
