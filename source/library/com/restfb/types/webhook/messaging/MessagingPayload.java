/**
 * Copyright (c) 2010-2016 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.restfb.types.webhook.messaging;

import com.restfb.Facebook;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class MessagingPayload {

  @Getter
  @Setter
  @Facebook
  private String url;

  @Getter
  @Setter
  @Facebook("template_type")
  private String templateType;

  @Getter
  @Setter
  @Facebook
  private List<ButtonItem> buttons;

  @Getter
  @Setter
  @Facebook
  private List<ElementItem> elements;

  @Getter
  @Setter
  @Facebook("recipient_name")
  private String recipientName;

  @Getter
  @Setter
  @Facebook("order_number")
  private String orderNumber;

  @Getter
  @Setter
  @Facebook
  private String currency;

  @Getter
  @Setter
  @Facebook("payment_method")
  private String paymentMethod;

  @Getter
  @Setter
  @Facebook("order_url")
  private String orderUrl;

  @Getter
  @Setter
  @Facebook
  private Long timestamp;

  @Getter
  @Setter
  @Facebook
  private AddressItem address;

  @Getter
  @Setter
  @Facebook
  private SummaryItem summary;

  @Getter
  @Setter
  @Facebook
  private List<AdjustmentItem> adjustmentItems;
}
