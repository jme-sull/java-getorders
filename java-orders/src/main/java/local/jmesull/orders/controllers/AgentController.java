package local.jmesull.orders.controllers;


import local.jmesull.orders.models.Agent;
import local.jmesull.orders.services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/agents")
public class AgentController

    //GET /agents/agent/{id} - Returns the agent and their customers with the given agent id
{
    @Autowired
    private AgentServices agentService;

    // http://localhost:2019/agents/agent/{id}

    @GetMapping(value = "agent/{agentcode}", produces = "application/json")
    public ResponseEntity<?> findAgentById(@PathVariable long agentcode)
    {
            Agent a = agentService.findById(agentcode);
            return new ResponseEntity<>(a, HttpStatus.OK);
    }



}
