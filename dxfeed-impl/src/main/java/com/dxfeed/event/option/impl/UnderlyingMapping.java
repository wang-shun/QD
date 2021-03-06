/*
 * !++
 * QDS - Quick Data Signalling Library
 * !-
 * Copyright (C) 2002 - 2017 Devexperts LLC
 * !-
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, You can obtain one at
 * http://mozilla.org/MPL/2.0/.
 * !__
 */
package com.dxfeed.event.option.impl;

import com.devexperts.qd.DataRecord;
import com.devexperts.qd.ng.RecordCursor;
import com.devexperts.qd.ng.RecordMapping;
import com.devexperts.qd.util.Decimal;
import com.devexperts.qd.util.MappingUtil;

public class UnderlyingMapping extends RecordMapping {
// BEGIN: CODE AUTOMATICALLY GENERATED: DO NOT MODIFY. IT IS REGENERATED BY com.dxfeed.api.codegen.ImplCodeGen
	private final int iVolatility;
	private final int iFrontVolatility;
	private final int iBackVolatility;
	private final int iPutCallRatio;

	public UnderlyingMapping(DataRecord record) {
		super(record);
		iVolatility = MappingUtil.findIntField(record, "Volatility", false);
		iFrontVolatility = MappingUtil.findIntField(record, "FrontVolatility", false);
		iBackVolatility = MappingUtil.findIntField(record, "BackVolatility", false);
		iPutCallRatio = MappingUtil.findIntField(record, "PutCallRatio", false);
	}

	public double getVolatility(RecordCursor cursor) {
		if (iVolatility < 0)
			return Double.NaN;
		return Decimal.toDouble(getInt(cursor, iVolatility));
	}

	public void setVolatility(RecordCursor cursor, double volatility) {
		if (iVolatility < 0)
			return;
		setInt(cursor, iVolatility, Decimal.compose(volatility));
	}

	public int getVolatilityDecimal(RecordCursor cursor) {
		if (iVolatility < 0)
			return 0;
		return getInt(cursor, iVolatility);
	}

	public void setVolatilityDecimal(RecordCursor cursor, int volatility) {
		if (iVolatility < 0)
			return;
		setInt(cursor, iVolatility, volatility);
	}

	public double getFrontVolatility(RecordCursor cursor) {
		if (iFrontVolatility < 0)
			return Double.NaN;
		return Decimal.toDouble(getInt(cursor, iFrontVolatility));
	}

	public void setFrontVolatility(RecordCursor cursor, double frontVolatility) {
		if (iFrontVolatility < 0)
			return;
		setInt(cursor, iFrontVolatility, Decimal.compose(frontVolatility));
	}

	public int getFrontVolatilityDecimal(RecordCursor cursor) {
		if (iFrontVolatility < 0)
			return 0;
		return getInt(cursor, iFrontVolatility);
	}

	public void setFrontVolatilityDecimal(RecordCursor cursor, int frontVolatility) {
		if (iFrontVolatility < 0)
			return;
		setInt(cursor, iFrontVolatility, frontVolatility);
	}

	public double getBackVolatility(RecordCursor cursor) {
		if (iBackVolatility < 0)
			return Double.NaN;
		return Decimal.toDouble(getInt(cursor, iBackVolatility));
	}

	public void setBackVolatility(RecordCursor cursor, double backVolatility) {
		if (iBackVolatility < 0)
			return;
		setInt(cursor, iBackVolatility, Decimal.compose(backVolatility));
	}

	public int getBackVolatilityDecimal(RecordCursor cursor) {
		if (iBackVolatility < 0)
			return 0;
		return getInt(cursor, iBackVolatility);
	}

	public void setBackVolatilityDecimal(RecordCursor cursor, int backVolatility) {
		if (iBackVolatility < 0)
			return;
		setInt(cursor, iBackVolatility, backVolatility);
	}

	public double getPutCallRatio(RecordCursor cursor) {
		if (iPutCallRatio < 0)
			return Double.NaN;
		return Decimal.toDouble(getInt(cursor, iPutCallRatio));
	}

	public void setPutCallRatio(RecordCursor cursor, double putCallRatio) {
		if (iPutCallRatio < 0)
			return;
		setInt(cursor, iPutCallRatio, Decimal.compose(putCallRatio));
	}

	public int getPutCallRatioDecimal(RecordCursor cursor) {
		if (iPutCallRatio < 0)
			return 0;
		return getInt(cursor, iPutCallRatio);
	}

	public void setPutCallRatioDecimal(RecordCursor cursor, int putCallRatio) {
		if (iPutCallRatio < 0)
			return;
		setInt(cursor, iPutCallRatio, putCallRatio);
	}
// END: CODE AUTOMATICALLY GENERATED
}
