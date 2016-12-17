package ch.heigvd.quaris.api;

import ch.heigvd.quaris.api.dto.Event;
import ch.heigvd.quaris.api.dto.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-14T23:22:01.292+01:00")

@Api(value = "events", description = "the events API")
public interface EventsApi {

    @ApiOperation(value = "Create a new event", notes = "When an event happens on the client side, an Event object is posted to the API.", response = Event.class, tags={ "Event", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Event was accepted", response = Event.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Event.class) })
    @RequestMapping(value = "/events",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Event> reportEvent(
@ApiParam(value = "token that identifies the application sending the request" ,required=true ) @RequestHeader(value="X-Gamification-Token", required=true) String xGamificationToken


,

@ApiParam(value = "Event to add" ,required=true ) @RequestBody Event event

);

}