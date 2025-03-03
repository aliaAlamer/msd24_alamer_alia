# Switches and Layer 2: The Basics of Network Communication

## Introduction

Switches are central components in local area networks (LANs). They operate at Layer 2 of the OSI model and are responsible for efficiently forwarding data packets between devices within the same network.
A switch is a networking device that forwards data packets between devices in a local network. Unlike a hub, a switch sends data only to the specific recipient, which increases network efficiency.

![switch](resources\images\switches.png)

### Key Features of a Switch

- _Layer 2 Operation_: Operates at the Data Link Layer (Layer 2) of the OSI model.
- _MAC Addresses_: Uses MAC addresses to identify devices and deliver data packets.
- _Collision Domains_: Reduces collisions by creating separate collision domains for each port.

#### Types of _Switches_

| Layer | Switch Type          | Description                                      |
|-------|----------------------|--------------------------------------------------|
| 2     | Layer 2 Switches     | For basic LAN switching                          |
| 3     | Layer 3 Switches     | Add routing capabilities for inter-VLAN communication |
| 4     | Layer 4 Switches     | Provide application-aware traffic management     |

#### How does a switch work at layer 2?

```plaintext
Learning MAC Addresses: A switch learns the MAC addresses of connected devices by monitoring network traffic.

MAC Address Table: The switch stores the learned MAC addresses in a table.

Forwarding Data Packets: The switch sends data packets only to the port connected to the destination MAC address.

Broadcasts and Unicasts: Broadcasts (to all devices) are sent to all ports, while unicasts (to a specific device) are sent only to the target port.
```

##### VLANS

- **Purpose**: VLANs logically segment a physical network into multiple broadcast domains, improving security and efficiency
- Benefits:
  1. reduces broadcast traffic.
  2. enhances security by isolating sensitive data.
  3. simplifices network managment

![VLANs](resources\images\vlans.png)

###### additional resources

- [OSI Model Explained](https://www.geeksforgeeks.org/open-systems-interconnection-model-osi/)
- [VLANs](https://www.geeksforgeeks.org/virtual-lan-vlan/)
- [Switch](https://www.geeksforgeeks.org/what-is-a-network-switch-and-how-does-it-work/)
