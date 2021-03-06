/**
 * Copyright (C) ARM Limited 2013-2015. All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 */

#ifndef EVENTS_XML
#define EVENTS_XML

#include "mxml/mxml.h"

class EventsXML {
public:
	EventsXML() {}

	mxml_node_t *getTree();
	char *getXML();
	void write(const char* path);

private:
	// Intentionally unimplemented
	EventsXML(const EventsXML &);
	EventsXML &operator=(const EventsXML &);
};

#endif // EVENTS_XML
